ListView listview = findViewId(R.id.namaListView);

List<String> data = new ArrayList<>();

// memasukan data
data.add("test");

ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_expandable_list_item_1, data);
listView.setAdapter(adapter);
