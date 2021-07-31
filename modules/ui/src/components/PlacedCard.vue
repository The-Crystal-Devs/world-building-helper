<template>
  <div v-for="idea in card.ideas">
    {{idea}}
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

</style>