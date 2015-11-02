/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationInvAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationInvAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationInvAssocObjectData InvsLocationInvAssocCreateIn;
/**
 *
 * Constructor to create a  InvsLocationInvAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationInvAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectData InvsLocationInvAssocCreateInIn) {
    super(id, context, "InvsLocationInvAssocCreate");
    InvsLocationInvAssocCreateIn = InvsLocationInvAssocCreateInIn;
  }

  public void translateToMap() {
    if (InvsLocationInvAssocCreateIn != null) {
      InvsLocationInvAssocCreateIn.resetFlags(true, true);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocCreateIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }


/**
 *
 * Sets the InvsLocationInvAssoc
 * @param InvsLocationInvAssocCreateInIn Value of the InvsLocationInvAssocCreateIn
 *
 */

  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectData InvsLocationInvAssocCreateInIn) {
    InvsLocationInvAssocCreateIn = InvsLocationInvAssocCreateInIn;
  }

  public void translateFromMap() {
    InvsLocationInvAssocCreateIn = InvsLocationInvAssocObjectHelper.fromMap(inputMap, "InvsLocationInvAssoc");
  }

/**
 *
 * Gets the InvsLocationInvAssoc
 * @return Value of the InvsLocationInvAssoc
 *
 */

  public InvsLocationInvAssocObjectData getInvsLocationInvAssoc( ) {
    return InvsLocationInvAssocCreateIn;
  }

}
