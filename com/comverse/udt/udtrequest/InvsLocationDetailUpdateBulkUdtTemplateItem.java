/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationDetailUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailObjectData ILDUpdateIn;
/**
 *
 * Constructor to create a  InvsLocationDetailUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectData ILDUpdateInIn) {
    super(id, context, "InvsLocationDetailUpdate");
    ILDUpdateIn = ILDUpdateInIn;
  }

  public void translateToMap() {
    if (ILDUpdateIn != null) {
      ILDUpdateIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDUpdateIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }


/**
 *
 * Sets the InvsLocationDetail
 * @param ILDUpdateInIn Value of the ILDUpdateIn
 *
 */

  public void setInvsLocationDetail(InvsLocationDetailObjectData ILDUpdateInIn) {
    ILDUpdateIn = ILDUpdateInIn;
  }

  public void translateFromMap() {
    ILDUpdateIn = InvsLocationDetailObjectHelper.fromMap(inputMap, "InvsLocationDetail");
  }

/**
 *
 * Gets the InvsLocationDetail
 * @return Value of the InvsLocationDetail
 *
 */

  public InvsLocationDetailObjectData getInvsLocationDetail( ) {
    return ILDUpdateIn;
  }

}
