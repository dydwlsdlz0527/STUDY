//타입 별칭
type User = {
    id:number;
    name:string;
    nickname:string;
    birth:string;
    bio:string;
    location:string;
};


let user: User = {
    id:1,
    name:"김용진",
    nickname:"winterlood",
    birth:"1992.05.27",
    bio:"안녕하세요",
    location:"오산"
};

type CountryCodes = {
    [key : string] : string;
};

// 인덱스 시그니처
let countryCodes: CountryCodes = {
    Korea : 'ko',
    UnitedState : 'us',
    UnitedKingdom : 'uk',
};

type CountryNumberCodes = {
    [key: string]: number;
    //Korea: number;
};

let countryNumberCodes : CountryNumberCodes = {};