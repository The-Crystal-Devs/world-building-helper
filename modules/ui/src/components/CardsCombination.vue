<template>
  <div class="cardsCombination">
    <v-stage :config="configKonva">
      <v-layer>
        <div v-for="card in cards">
          <PlacedCard :card="card"></PlacedCard>
        </div>
      </v-layer>
    </v-stage>
  </div>
</template>

<script>
import PlacedCard from "./PlacedCard.vue";

export default {
  name: "CardsCombination",
  components: {PlacedCard},
  data() {
    return {
      configKonva: {
        width: 600,
        height: 600,
        border: "1px solid black"
      }
    }
  },
  props: {
    cards: {
      type: Array,
      required: true
    }
  }
}
</script>

<style>
.cardsCombination {
  border: 1px solid black;
  background-color: #eeeeee;
  width: 600px;
  height: 600px;
}
</style>