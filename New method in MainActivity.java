/**
 * This method displays the given quantity value on the screen.
 */
private void displayPrice(int number) {
       TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
       priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
}
