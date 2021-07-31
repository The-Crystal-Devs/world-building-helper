export enum CardType {
    AGENT,
    ANCHOR,
    ASPECT,
    CONFLICT,
    ENGINE
}

export class Card {
    constructor(public readonly type: CardType, public readonly ideas: string[]) {
    }
}