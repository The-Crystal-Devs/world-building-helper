<template>
  <CardsCombination :cards="drawnCards"></CardsCombination>
  <button @click="drawCard">Draw card</button>
</template>

<script lang="ts">
import {defineComponent} from 'vue'
import {CardLoader} from './components/card-loader';
import {Deck} from './components/deck';
import {Card} from './components/card';
import CardsCombination from './components/CardsCombination.vue';

const deck = new Deck(CardLoader.loadCards());

export default defineComponent({
  name: 'App',
  components: {
    CardsCombination
  },
  data() {
    const drawnCards: Card[] = [];
    return {
      drawnCards: drawnCards
    }
  },
  methods: {
    drawCard() {
     this.drawnCards.push(deck.draw());
    }
  }
})

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
