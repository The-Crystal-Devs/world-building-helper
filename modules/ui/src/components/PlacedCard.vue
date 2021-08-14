<template>
  <v-group :config="{draggable:true}">
    <v-shape :config="leftArrowConfig"/>
    <v-shape :config="rightArrowConfig"/>
    <v-rect :config="cardConfig"></v-rect>
    <v-text :config="idea1Config"></v-text>
    <v-text :config="idea2Config"></v-text>
    <v-text :config="idea3Config"></v-text>
    <v-text :config="idea4Config"></v-text>
  </v-group>
</template>

<script lang="ts">
import {defineComponent} from "vue";
import {Card} from "./card";

const arrowXStart = 350;
const arrowYStart = 80;

function generateArrowSceneFunc(direction: number): Function {
  let applyDirection = (start: number, offset: number) => start + direction * offset;

  return (context: any, shape: any) => {
    context.beginPath();
    context.moveTo(applyDirection(arrowXStart, 2), arrowYStart);
    context.lineTo(applyDirection(arrowXStart, 22), arrowYStart);
    context.lineTo(applyDirection(arrowXStart, 22), applyDirection(arrowYStart, -10));
    context.lineTo(applyDirection(arrowXStart, 42), arrowYStart);
    context.lineTo(applyDirection(arrowXStart, 22), applyDirection(arrowYStart, 10));
    context.lineTo(applyDirection(arrowXStart, 22), arrowYStart);

    // special Konva.js method
    context.fillStrokeShape(shape);
  }
}

function generateArrowConfig(direction: number): any {
  return {
    sceneFunc: generateArrowSceneFunc(direction),
    stroke: 'black',
    strokeWidth: 4
  }
}

export default defineComponent({
  name: "PlacedCard",
  data(): any {
    return {
      cardConfig: {
        x: 300,
        y: 100,
        width: 100,
        height: 100,
        fill: 'white',
        stroke: 'black'
      },
      idea1Config: {
        text: this.card.ideas[0],
        fontSize: 15,
        x: 325,
        y: 103
      },
      idea2Config: {
        text: this.card.ideas[1],
        fontSize: 15,
        x: 397,
        y: 125,
        rotation: 90
      },
      idea3Config: {
        text: this.card.ideas[2],
        fontSize: 15,
        x: 375,
        y: 197,
        rotation: 180
      },
      idea4Config: {
        text: this.card.ideas[3],
        fontSize: 15,
        x: 303,
        y: 175,
        rotation: 270
      },
      leftArrowConfig: generateArrowConfig(-1),
      rightArrowConfig: generateArrowConfig(1)
    }
  },
  props: {
    card: {
      type: Card,
      required: true
    }
  }})
</script>

<style scoped>
</style>