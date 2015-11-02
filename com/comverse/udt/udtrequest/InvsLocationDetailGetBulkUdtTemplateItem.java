/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailObjectKeyData ILDGetIn;
/**
 *
 * Constructor to create a  InvsLocationDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectKeyData ILDGetInIn) {
    super(id, context, "InvsLocationDetailGet");
    ILDGetIn = ILDGetInIn;
  }

  public void translateToMap() {
    if (ILDGetIn != null) {
      ILDGetIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(ILDGetIn, new HashMap(), "InvsLocationDetailObjectKeyData").get("InvsLocationDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationDetail
 * @param ILDGetInIn Value of the ILDGetIn
 *
 */

  public void setInvsLocationDetail(InvsLocationDetailObjectKeyData ILDGetInIn) {
    ILDGetIn = ILDGetInIn;
  }

  public void translateFromMap() {
    ILDGetIn = InvsLocationDetailObjectKeyHelper.fromMap(inputMap, "InvsLocationDetail");
  }

/**
 *
 * Gets the InvsLocationDetail
 * @return Value of the InvsLocationDetail
 *
 */

  public InvsLocationDetailObjectKeyData getInvsLocationDetail( ) {
    return ILDGetIn;
  }

}
