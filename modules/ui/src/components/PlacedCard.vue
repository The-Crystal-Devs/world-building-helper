<template>
  <v-rect :config="cardConfig"></v-rect>
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
        fill: 'red',
        draggable:true,
        stroke: 'black'
      }
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
.card {
  border: 4px solid #2c3e50;
  width:200px;
  height:200px;
  margin: auto auto 10px;
}
</style>