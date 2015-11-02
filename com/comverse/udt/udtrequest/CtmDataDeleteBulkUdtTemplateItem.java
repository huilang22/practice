/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CtmDataDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmDataDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmDataRowKeyData CtmDataDeleteIn;
  protected Integer ____table_id;
/**
 *
 * Constructor to create a  CtmDataDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmDataDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowKeyData CtmDataDeleteInIn, Integer ____table_idIn) {
    super(id, context, "CtmDataDelete");
    CtmDataDeleteIn = CtmDataDeleteInIn;
    ____table_id = ____table_idIn;
  }

  public void translateToMap() {
    if (CtmDataDeleteIn != null) {
      CtmDataDeleteIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowKeyHelper.toMap(CtmDataDeleteIn, new HashMap(), "CtmDataRowKeyData").get("CtmDataRowKeyData"));
    }
    if (____table_id != null) {
      addInput("TableId", ____table_id);
    }
  }


/**
 *
 * Sets the CtmData
 * @param CtmDataDeleteInIn Value of the CtmDataDeleteIn
 *
 */

  public void setCtmData(CtmDataRowKeyData CtmDataDeleteInIn) {
    CtmDataDeleteIn = CtmDataDeleteInIn;
  }

/**
 *
 * Sets the TableId
 * @param ____table_idIn Value of the ____table_id
 *
 */

  public void setTableId(Integer ____table_idIn) {
    ____table_id = ____table_idIn;
  }

  public void translateFromMap() {
    CtmDataDeleteIn = CtmDataRowKeyHelper.fromMap(inputMap, "CtmData");
    ____table_id = (Integer)inputMap.get("TableId");
  }

/**
 *
 * Gets the CtmData
 * @return Value of the CtmData
 *
 */

  public CtmDataRowKeyData getCtmData( ) {
    return CtmDataDeleteIn;
  }

/**
 *
 * Gets the TableId
 * @return Value of the TableId
 *
 */

  public Integer getTableId( ) {
    return ____table_id;
  }

}
