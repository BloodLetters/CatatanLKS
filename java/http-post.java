public static boolean post(String nim, String nama, String jurusan, String alamat) {
    StrictMode.ThreadPolicy builder = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.setThreadPolicy(builder);

    try {
        String endpointUrl = "http://" + localhost + "/api/input.php";
        String formData = "nim=" + nim + "&nama=" + nama + "&jurusan=" + jurusan + "&alamat=" + alamat;

        HttpURLConnection connection = (HttpURLConnection) new URL(endpointUrl).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream();
             OutputStreamWriter writer = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
            writer.write(formData);
        }

        int responseCode = connection.getResponseCode();
        connection.disconnect();
        return responseCode == 200;
    } catch (Exception e) {
        Log.e("Eror", Objects.requireNonNull(e.getMessage()));
    }

    return false;
}
