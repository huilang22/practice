/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjDeleteBulkUdtTemplateItem.java
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
 * Class used to create a MultiLinesAdjDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class MultiLinesAdjDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MultiLinesAdjKeyObjectFilter MLA_Delete_In;
/**
 *
 * Constructor to create a  MultiLinesAdjDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MultiLinesAdjDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, MultiLinesAdjKeyObjectFilter MLA_Delete_InIn) {
    super(id, context, "MultiLinesAdjDelete");
    MLA_Delete_In = MLA_Delete_InIn;
  }

  public void translateToMap() {
    if (MLA_Delete_In != null) {
      Integer index =  MLA_Delete_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MultiLinesAdj", MultiLinesAdjKeyObjectHelper.toMap(MLA_Delete_In, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }


/**
 *
 * Sets the MultiLinesAdj
 * @param MLA_Delete_InIn Value of the MLA_Delete_In
 *
 */

  public void setMultiLinesAdj(MultiLinesAdjKeyObjectFilter MLA_Delete_InIn) {
    MLA_Delete_In = MLA_Delete_InIn;
  }

  public void translateFromMap() {
    MLA_Delete_In = MultiLinesAdjKeyObjectHelper.fromMapFilter(inputMap, "MultiLinesAdj");
  }

/**
 *
 * Gets the MultiLinesAdj
 * @return Value of the MultiLinesAdj
 *
 */

  public MultiLinesAdjKeyObjectFilter getMultiLinesAdj( ) {
    return MLA_Delete_In;
  }

}
