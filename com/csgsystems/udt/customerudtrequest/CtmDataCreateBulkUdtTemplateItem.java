/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CtmDataCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmDataCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmDataRowData CtmDataCreateIn;
  protected Integer table_id;
/**
 *
 * Constructor to create a  CtmDataCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmDataCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowData CtmDataCreateInIn, Integer table_idIn) {
    super(id, context, "CtmDataCreate");
    CtmDataCreateIn = CtmDataCreateInIn;
    table_id = table_idIn;
  }

  public void translateToMap() {
    if (CtmDataCreateIn != null) {
      CtmDataCreateIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataCreateIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (table_id != null) {
      addInput("TableId", table_id);
    }
  }


/**
 *
 * Sets the CtmData
 * @param CtmDataCreateInIn Value of the CtmDataCreateIn
 *
 */

  public void setCtmData(CtmDataRowData CtmDataCreateInIn) {
    CtmDataCreateIn = CtmDataCreateInIn;
  }

/**
 *
 * Sets the TableId
 * @param table_idIn Value of the table_id
 *
 */

  public void setTableId(Integer table_idIn) {
    table_id = table_idIn;
  }

  public void translateFromMap() {
    CtmDataCreateIn = CtmDataRowHelper.fromMap(inputMap, "CtmData");
    table_id = (Integer)inputMap.get("TableId");
  }

/**
 *
 * Gets the CtmData
 * @return Value of the CtmData
 *
 */

  public CtmDataRowData getCtmData( ) {
    return CtmDataCreateIn;
  }

/**
 *
 * Gets the TableId
 * @return Value of the TableId
 *
 */

  public Integer getTableId( ) {
    return table_id;
  }

}
