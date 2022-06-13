package org.urbcomp.start.db.executor

import org.urbcomp.start.db.AbstractCalciteFunctionTest

class SqlShowTablesExecutorTest extends AbstractCalciteFunctionTest {

  test("testShowTables") {
    val stmt = connect.createStatement()
    val rs = stmt.executeQuery("SHOW TABLES");
    while (rs.next()) {
      println(rs.getString(1));
    }
  }
}
