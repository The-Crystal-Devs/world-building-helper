import {Card} from './card';

export class Deck {
    constructor(private cards: Card[]) {
    }

    draw(): Card {
        const drawnCard = this.cards[0];
        this.cards = this.cards.slice(1);
        return drawnCard;
    }
}