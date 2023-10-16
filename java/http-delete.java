public static boolean delete(String nim) {
    StrictMode.ThreadPolicy builder = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.setThreadPolicy(builder);
    boolean res = false;

    try {
        String endpointUrl = "http://" + localhost + "/api/delete.php"; // Ganti URL sesuai dengan kebutuhan Anda
        String jsonData = "{\"nim\": \"" + nim + "\"}";

        HttpURLConnection connection = (HttpURLConnection) new URL(endpointUrl).openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            os.write(jsonData.getBytes(StandardCharsets.UTF_8));
        }
        res = connection.getResponseCode() == 200;
        connection.disconnect();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return  res;
}
