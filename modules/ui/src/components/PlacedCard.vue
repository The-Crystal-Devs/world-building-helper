<template>
  <div class="card">
    <div v-for="idea in card.ideas">
      {{ idea }}
    </div>
  </div>
</template>

<script>
import {Card} from "./card";

export default {
  name: "PlacedCard",
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