/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsMccCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMccCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMccCodeObjectFilter InvsMccCodeFindIn;
/**
 *
 * Constructor to create a  InvsMccCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMccCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMccCodeObjectFilter InvsMccCodeFindInIn) {
    super(id, context, "InvsMccCodeFind");
    InvsMccCodeFindIn = InvsMccCodeFindInIn;
  }

  public void translateToMap() {
    if (InvsMccCodeFindIn != null) {
      Integer index =  InvsMccCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(InvsMccCodeFindIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }


/**
 *
 * Sets the InvsMccCode
 * @param InvsMccCodeFindInIn Value of the InvsMccCodeFindIn
 *
 */

  public void setInvsMccCode(InvsMccCodeObjectFilter InvsMccCodeFindInIn) {
    InvsMccCodeFindIn = InvsMccCodeFindInIn;
  }

  public void translateFromMap() {
    InvsMccCodeFindIn = InvsMccCodeObjectHelper.fromMapFilter(inputMap, "InvsMccCode");
  }

/**
 *
 * Gets the InvsMccCode
 * @return Value of the InvsMccCode
 *
 */

  public InvsMccCodeObjectFilter getInvsMccCode( ) {
    return InvsMccCodeFindIn;
  }

}
