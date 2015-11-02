/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationDetailCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationDetailObjectData ILDCreateIn;
/**
 *
 * Constructor to create a  InvsLocationDetailCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectData ILDCreateInIn) {
    super(id, context, "InvsLocationDetailCreate");
    ILDCreateIn = ILDCreateInIn;
  }

  public void translateToMap() {
    if (ILDCreateIn != null) {
      ILDCreateIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDCreateIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }


/**
 *
 * Sets the InvsLocationDetail
 * @param ILDCreateInIn Value of the ILDCreateIn
 *
 */

  public void setInvsLocationDetail(InvsLocationDetailObjectData ILDCreateInIn) {
    ILDCreateIn = ILDCreateInIn;
  }

  public void translateFromMap() {
    ILDCreateIn = InvsLocationDetailObjectHelper.fromMap(inputMap, "InvsLocationDetail");
  }

/**
 *
 * Gets the InvsLocationDetail
 * @return Value of the InvsLocationDetail
 *
 */

  public InvsLocationDetailObjectData getInvsLocationDetail( ) {
    return ILDCreateIn;
  }

}
