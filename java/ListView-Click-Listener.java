ListView listView = view.findViewById(R.id.list_item);
ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_expandable_list_item_1, data);
listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String teksModal = "Teks yang akan ditampilkan dalam modal.";

        // Membuat AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Modal Title"); // Judul modal (opsional)
        builder.setMessage(teksModal);

        // Tombol "OK" untuk menutup modal
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // Menutup modal
            }
        });

        // Membuat dan menampilkan AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
