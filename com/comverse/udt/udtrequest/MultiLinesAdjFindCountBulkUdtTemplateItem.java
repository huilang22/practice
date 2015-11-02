/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjFindCountBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a MultiLinesAdjFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class MultiLinesAdjFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MultiLinesAdjObjectFilter MLA_Bill_Count_In;
/**
 *
 * Constructor to create a  MultiLinesAdjFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MultiLinesAdjFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Count_InIn) {
    super(id, context, "MultiLinesAdjFindCount");
    MLA_Bill_Count_In = MLA_Bill_Count_InIn;
  }

  public void translateToMap() {
    if (MLA_Bill_Count_In != null) {
      Integer index =  MLA_Bill_Count_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(MLA_Bill_Count_In, new HashMap(), "MLABillCountOut").get("MLABillCountOut"));
    }
  }


/**
 *
 * Sets the MultiLinesAdj
 * @param MLA_Bill_Count_InIn Value of the MLA_Bill_Count_In
 *
 */

  public void setMultiLinesAdj(MultiLinesAdjObjectFilter MLA_Bill_Count_InIn) {
    MLA_Bill_Count_In = MLA_Bill_Count_InIn;
  }

  public void translateFromMap() {
    MLA_Bill_Count_In = MultiLinesAdjObjectHelper.fromMapFilter(inputMap, "MultiLinesAdj");
  }

/**
 *
 * Gets the MultiLinesAdj
 * @return Value of the MultiLinesAdj
 *
 */

  public MultiLinesAdjObjectFilter getMultiLinesAdj( ) {
    return MLA_Bill_Count_In;
  }

}
