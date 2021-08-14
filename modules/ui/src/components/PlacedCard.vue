<template>
  <v-group :config="{draggable:true}">
    <v-rect :config="cardConfig"></v-rect>
    <v-text :config="idea1Config"></v-text>
    <v-text :config="idea2Config"></v-text>
    <v-text :config="idea3Config"></v-text>
    <v-text :config="idea4Config"></v-text>
  </v-group>
</template>

<script>
import {Card} from "./card";

export default {
  name: "PlacedCard",
  data() {
    return {
      cardConfig: {
        x: 300,
        y: 100,
        width:100,
        height:100,
        fill: 'white',
        stroke: 'black'
      },
      idea1Config: {
        text: this.card.ideas[0],
        fontSize: 15,
        x:325,
        y:103
      },
      idea2Config: {
        text: this.card.ideas[1],
        fontSize: 15,
        x:397,
        y:125,
        rotation:90
      },
      idea3Config: {
        text: this.card.ideas[2],
        fontSize: 15,
        x:375,
        y:197,
        rotation:180
      },
      idea4Config: {
        text: this.card.ideas[3],
        fontSize: 15,
        x:303,
        y:175,
        rotation:270
      },
    }
  },
  props: {
    card: {
      type: Card,
      required: true
    }
  }
}
</script>

<style scoped>
</style>