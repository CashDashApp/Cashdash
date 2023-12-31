package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.Category;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryService {
    public static ArrayList<Category> getAll() throws Exception {
        ArrayList<Category> categories = new ArrayList<>();

        try (ResultSet result = Database.executeQuery("SELECT * FROM category")) {
            while (result.next()) {
                Category category = new Category(
                    result.getInt("id"),
                    result.getString("name")
                );
                categories.add(category);
            }
        }
        return categories;
    }

    public static int create(Category category) {
        return Database.executeUpdate("INSERT INTO category VALUES (NULL, ?)",
            category.getName()
        );
    }

    public static int delete(Category category) {
        return Database.executeUpdate("DELETE FROM category WHERE id = ?",
            category.getId()
        );
    }
}