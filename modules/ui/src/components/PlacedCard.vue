<template>
  {{ card.ideas[0] }}
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