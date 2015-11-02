/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtmDataUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmDataUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmDataRowData CtmDataUpdateIn;
  protected Integer ___table_id;
/**
 *
 * Constructor to create a  CtmDataUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmDataUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowData CtmDataUpdateInIn, Integer ___table_idIn) {
    super(id, context, "CtmDataUpdate");
    CtmDataUpdateIn = CtmDataUpdateInIn;
    ___table_id = ___table_idIn;
  }

  public void translateToMap() {
    if (CtmDataUpdateIn != null) {
      CtmDataUpdateIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataUpdateIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (___table_id != null) {
      addInput("TableId", ___table_id);
    }
  }


/**
 *
 * Sets the CtmData
 * @param CtmDataUpdateInIn Value of the CtmDataUpdateIn
 *
 */

  public void setCtmData(CtmDataRowData CtmDataUpdateInIn) {
    CtmDataUpdateIn = CtmDataUpdateInIn;
  }

/**
 *
 * Sets the TableId
 * @param ___table_idIn Value of the ___table_id
 *
 */

  public void setTableId(Integer ___table_idIn) {
    ___table_id = ___table_idIn;
  }

  public void translateFromMap() {
    CtmDataUpdateIn = CtmDataRowHelper.fromMap(inputMap, "CtmData");
    ___table_id = (Integer)inputMap.get("TableId");
  }

/**
 *
 * Gets the CtmData
 * @return Value of the CtmData
 *
 */

  public CtmDataRowData getCtmData( ) {
    return CtmDataUpdateIn;
  }

/**
 *
 * Gets the TableId
 * @return Value of the TableId
 *
 */

  public Integer getTableId( ) {
    return ___table_id;
  }

}
