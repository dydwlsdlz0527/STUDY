const quotes = [
    {
        quote : "The way to get started is to quit talking and begin doing.",
        author : "Walt Disney",
    },
    {
        quote : "Life is what happens when you're busy making other plans.",
        author : "John Lennon",
    },
    {
        quote : "Thw world is a book and those who do not travel read only",
        author : "Saint Augustine",
    },
    {
        quote : "One of these days is none of these days.",
        author : "AA",
    },
    {
        quote : "First, they ignore you,then they ridicule you,then they fight you,and then you win.",
        author : "BB",
    },
    {
        quote : "Two men looked out from prison bars.One saw the mud, the other saw stars.",
        author : "CC",
    },
    {
        quote : "Good habits are the key to all success. Bad habits are the unlocked door to failure.",
        author : "Og Mandino",
    },
    {
        quote : "Habits are not a finish line to be crossed, they are a lifestyle to be lived.",
        author : "James Clear",
    },
    {
        quote : "Successful people are simply those with successful habits.",
        author : "Brian Tracy",
    },
    {
        quote : "Motivation is what gets you started. Habit is what keeps you going.",
        author : "Jim Rohn",
    },
];
const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaytsQuotes = quotes[Math.floor(Math.random()*quotes.length)];
quote.innerHTML = todaytsQuotes.quote;
author.innerHTML = todaytsQuotes.author;
