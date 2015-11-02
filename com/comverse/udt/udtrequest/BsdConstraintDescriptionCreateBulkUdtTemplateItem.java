/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintDescriptionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintDescriptionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintDescriptionObjectData bsdConstraintDescriptionCreateIn;
/**
 *
 * Constructor to create a  BsdConstraintDescriptionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintDescriptionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectData bsdConstraintDescriptionCreateInIn) {
    super(id, context, "BsdConstraintDescriptionCreate");
    bsdConstraintDescriptionCreateIn = bsdConstraintDescriptionCreateInIn;
  }

  public void translateToMap() {
    if (bsdConstraintDescriptionCreateIn != null) {
      bsdConstraintDescriptionCreateIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionCreateIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }


/**
 *
 * Sets the BsdConstraintDescription
 * @param bsdConstraintDescriptionCreateInIn Value of the bsdConstraintDescriptionCreateIn
 *
 */

  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectData bsdConstraintDescriptionCreateInIn) {
    bsdConstraintDescriptionCreateIn = bsdConstraintDescriptionCreateInIn;
  }

  public void translateFromMap() {
    bsdConstraintDescriptionCreateIn = BsdConstraintDescriptionObjectHelper.fromMap(inputMap, "BsdConstraintDescription");
  }

/**
 *
 * Gets the BsdConstraintDescription
 * @return Value of the BsdConstraintDescription
 *
 */

  public BsdConstraintDescriptionObjectData getBsdConstraintDescription( ) {
    return bsdConstraintDescriptionCreateIn;
  }

}
