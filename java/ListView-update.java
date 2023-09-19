List<String> data = new ArrayList<>();
data.add("test");
ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_expandable_list_item_1, data);
listView.setAdapter(adapter);
