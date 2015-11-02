/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsLocationDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailObjectFilter ILDFindIn;
/**
 *
 * Constructor to create a  InvsLocationDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectFilter ILDFindInIn) {
    super(id, context, "InvsLocationDetailFind");
    ILDFindIn = ILDFindInIn;
  }

  public void translateToMap() {
    if (ILDFindIn != null) {
      Integer index =  ILDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDFindIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }


/**
 *
 * Sets the InvsLocationDetail
 * @param ILDFindInIn Value of the ILDFindIn
 *
 */

  public void setInvsLocationDetail(InvsLocationDetailObjectFilter ILDFindInIn) {
    ILDFindIn = ILDFindInIn;
  }

  public void translateFromMap() {
    ILDFindIn = InvsLocationDetailObjectHelper.fromMapFilter(inputMap, "InvsLocationDetail");
  }

/**
 *
 * Gets the InvsLocationDetail
 * @return Value of the InvsLocationDetail
 *
 */

  public InvsLocationDetailObjectFilter getInvsLocationDetail( ) {
    return ILDFindIn;
  }

}
