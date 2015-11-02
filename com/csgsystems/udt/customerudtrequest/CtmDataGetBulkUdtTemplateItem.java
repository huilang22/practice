/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataGetBulkUdtTemplateItem.java
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
 * Class used to create a CtmDataGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmDataGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmDataRowKeyData CtmDataGetIn;
  protected Integer _table_id;
/**
 *
 * Constructor to create a  CtmDataGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmDataGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowKeyData CtmDataGetInIn, Integer _table_idIn) {
    super(id, context, "CtmDataGet");
    CtmDataGetIn = CtmDataGetInIn;
    _table_id = _table_idIn;
  }

  public void translateToMap() {
    if (CtmDataGetIn != null) {
      CtmDataGetIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowKeyHelper.toMap(CtmDataGetIn, new HashMap(), "CtmDataRowKeyData").get("CtmDataRowKeyData"));
    }
    if (_table_id != null) {
      addInput("TableId", _table_id);
    }
  }


/**
 *
 * Sets the CtmData
 * @param CtmDataGetInIn Value of the CtmDataGetIn
 *
 */

  public void setCtmData(CtmDataRowKeyData CtmDataGetInIn) {
    CtmDataGetIn = CtmDataGetInIn;
  }

/**
 *
 * Sets the TableId
 * @param _table_idIn Value of the _table_id
 *
 */

  public void setTableId(Integer _table_idIn) {
    _table_id = _table_idIn;
  }

  public void translateFromMap() {
    CtmDataGetIn = CtmDataRowKeyHelper.fromMap(inputMap, "CtmData");
    _table_id = (Integer)inputMap.get("TableId");
  }

/**
 *
 * Gets the CtmData
 * @return Value of the CtmData
 *
 */

  public CtmDataRowKeyData getCtmData( ) {
    return CtmDataGetIn;
  }

/**
 *
 * Gets the TableId
 * @return Value of the TableId
 *
 */

  public Integer getTableId( ) {
    return _table_id;
  }

}
