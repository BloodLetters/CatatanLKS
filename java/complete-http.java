public static String ip = "http://192.168.1.2:3000";

public static boolean put(String id, String isi) {
    boolean res = false;

    JSONObject obj = new JSONObject();
    obj.put("id", id);
    obj.put("isi", isi);

    try {
        URL url = new URL(ip + "/komen/" + id);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "Application/Json");
        conn.setDoOutput(true);


        try(OutputStream os = conn.getOutputStream()) {
            os.write(obj.toString().getBytes());
        }

        int code = conn.getResponseCode();
        res = (code == 200 || code == 201 || code == 203);
        conn.disconnect();

    } catch (Exception ex) {
        ex.getStackTrace();
    }

    return  res;
}

public static boolean delete(String id) {
    boolean res = false;

    try {
        URL url = new URL(ip + "/komen/" + id);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        conn.setRequestMethod("DELETE");
        int code = conn.getResponseCode();

        conn.disconnect();
        res = (code == 200 || code == 201 || code == 202 || code == 204);

    } catch (Exception ex) {
        ex.getStackTrace();
    }

    return res;
}

public static boolean post(String komen) {
    boolean res = false;
    try {
        JSONObject jsonRequest = new JSONObject();
        jsonRequest.put("isi", komen);

        URL url = new URL(ip + "/komen");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            os.write(jsonRequest.toString().getBytes());
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == 200 || responseCode == 201 || responseCode == 202) {
            res = true;
        }

        connection.disconnect();
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    return res;
}

public static JSONObject get() {
    JSONObject obj = null;

    try {
        URL url = new URL(ip);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }

            obj = new JSONObject(builder.toString());
        }

        conn.disconnect();
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    return obj;
}
