import Axios from "axios";
import Cheerio from "cheerio";
import fs from "fs";

var currencies = [];

function currencyScrapp() {
return Axios.get("https://pathofexile.gamepedia.com/Currency").then((reponse) => {
    const $= Cheerio.load(reponse.data);
    var currency = {};
    var selectorCurrency = $("table:first-of-type").html();
    $(selectorCurrency).find("tbody > tr").each((indice, filaCurrency) => {
        currency.nombre = $(filaCurrency).find("td:nth-child(1) > span > span:nth-child(1) > a:nth-child(1)").text();
        currency.icono = $(filaCurrency).find("td:nth-child(1) > span > span:nth-child(1) > a:nth-child(2) > img").attr("src");
        currency.dropLevel = $(filaCurrency).find("td:nth-child(2)").attr("data-sort-value");
        currency.stackSize = $(filaCurrency).find("td:nth-child(3)").attr("data-sort-value");
        currency.tabStackSize = $(filaCurrency).find("td:nth-child(4)").attr("data-sort-value");
        currency.helpText = $(filaCurrency).find("td:nth-child(5)").text();
        if(currency.nombre != ''){
            currencies.push(currency);
        }
        currency = {};
    });
});
}


currencyScrapp().then(()=>{
    try {
        currencies.forEach((curr) => {
            var json = JSON.stringify(curr,null,2);
            fs.appendFile("currency.json", json+"\n", 'utf8', (error)=>{})
        });
    } catch (error) {
        console.log(error);
    }
});
