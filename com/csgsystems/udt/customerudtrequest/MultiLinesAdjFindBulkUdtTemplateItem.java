/*
 * Generated code DO NOT EDIT
 * Generated file: MultiLinesAdjFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a MultiLinesAdjFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MultiLinesAdjFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MultiLinesAdjObjectFilter MLA_Bill_Find_In;
/**
 *
 * Constructor to create a  MultiLinesAdjFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MultiLinesAdjFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MultiLinesAdjObjectFilter MLA_Bill_Find_InIn) {
    super(id, context, "MultiLinesAdjFind");
    MLA_Bill_Find_In = MLA_Bill_Find_InIn;
  }

  public void translateToMap() {
    if (MLA_Bill_Find_In != null) {
      Integer index =  MLA_Bill_Find_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(MLA_Bill_Find_In, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }


/**
 *
 * Sets the MultiLinesAdj
 * @param MLA_Bill_Find_InIn Value of the MLA_Bill_Find_In
 *
 */

  public void setMultiLinesAdj(MultiLinesAdjObjectFilter MLA_Bill_Find_InIn) {
    MLA_Bill_Find_In = MLA_Bill_Find_InIn;
  }

  public void translateFromMap() {
    MLA_Bill_Find_In = MultiLinesAdjObjectHelper.fromMapFilter(inputMap, "MultiLinesAdj");
  }

/**
 *
 * Gets the MultiLinesAdj
 * @return Value of the MultiLinesAdj
 *
 */

  public MultiLinesAdjObjectFilter getMultiLinesAdj( ) {
    return MLA_Bill_Find_In;
  }

}
