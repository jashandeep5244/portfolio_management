import { MutalFund } from "./mutal-fund";
import { Stock } from "./stock";

export class Portfolio {
    portfolioid : number | undefined;
    stockDetailList : Stock[] | undefined;
    mutualFundList : MutalFund[] | undefined;
}
