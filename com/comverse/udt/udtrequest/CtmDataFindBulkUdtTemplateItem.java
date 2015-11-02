/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataFindBulkUdtTemplateItem.java
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
 * Class used to create a CtmDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmDataRowFilter CtmDataFindIn;
  protected Integer __table_id;
/**
 *
 * Constructor to create a  CtmDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowFilter CtmDataFindInIn, Integer __table_idIn) {
    super(id, context, "CtmDataFind");
    CtmDataFindIn = CtmDataFindInIn;
    __table_id = __table_idIn;
  }

  public void translateToMap() {
    if (CtmDataFindIn != null) {
      Integer index =  CtmDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmData", CtmDataRowHelper.toMap(CtmDataFindIn, new HashMap(), "CtmData").get("CtmData"));
    }
    if (__table_id != null) {
      addInput("TableId", __table_id);
    }
  }


/**
 *
 * Sets the CtmData
 * @param CtmDataFindInIn Value of the CtmDataFindIn
 *
 */

  public void setCtmData(CtmDataRowFilter CtmDataFindInIn) {
    CtmDataFindIn = CtmDataFindInIn;
  }

/**
 *
 * Sets the TableId
 * @param __table_idIn Value of the __table_id
 *
 */

  public void setTableId(Integer __table_idIn) {
    __table_id = __table_idIn;
  }

  public void translateFromMap() {
    CtmDataFindIn = CtmDataRowHelper.fromMapFilter(inputMap, "CtmData");
    __table_id = (Integer)inputMap.get("TableId");
  }

/**
 *
 * Gets the CtmData
 * @return Value of the CtmData
 *
 */

  public CtmDataRowFilter getCtmData( ) {
    return CtmDataFindIn;
  }

/**
 *
 * Gets the TableId
 * @return Value of the TableId
 *
 */

  public Integer getTableId( ) {
    return __table_id;
  }

}
