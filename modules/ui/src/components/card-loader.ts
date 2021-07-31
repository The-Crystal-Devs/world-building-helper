import {Card, CardType} from './card';

export class CardLoader {
    public static loadCards(): Card[] {
        return [
            new Card(CardType.AGENT, ['a dog', 'a cat', 'a horse', 'a rabbit']),
            new Card(CardType.ANCHOR, ['a ruin', 'a boat', 'a house', 'a forest'])
        ];
    }
}