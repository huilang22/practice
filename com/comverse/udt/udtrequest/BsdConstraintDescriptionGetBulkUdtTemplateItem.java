/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionGetBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdConstraintDescriptionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintDescriptionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionGetIn;
/**
 *
 * Constructor to create a  BsdConstraintDescriptionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintDescriptionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionGetInIn) {
    super(id, context, "BsdConstraintDescriptionGet");
    bsdConstraintDescriptionGetIn = bsdConstraintDescriptionGetInIn;
  }

  public void translateToMap() {
    if (bsdConstraintDescriptionGetIn != null) {
      bsdConstraintDescriptionGetIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(bsdConstraintDescriptionGetIn, new HashMap(), "BsdConstraintDescriptionObjectKeyData").get("BsdConstraintDescriptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdConstraintDescription
 * @param bsdConstraintDescriptionGetInIn Value of the bsdConstraintDescriptionGetIn
 *
 */

  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionGetInIn) {
    bsdConstraintDescriptionGetIn = bsdConstraintDescriptionGetInIn;
  }

  public void translateFromMap() {
    bsdConstraintDescriptionGetIn = BsdConstraintDescriptionObjectKeyHelper.fromMap(inputMap, "BsdConstraintDescription");
  }

/**
 *
 * Gets the BsdConstraintDescription
 * @return Value of the BsdConstraintDescription
 *
 */

  public BsdConstraintDescriptionObjectKeyData getBsdConstraintDescription( ) {
    return bsdConstraintDescriptionGetIn;
  }

}
