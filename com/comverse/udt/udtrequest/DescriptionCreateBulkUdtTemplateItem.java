/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DescriptionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DescriptionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DescriptionObjectData DescriptionCreateIn;
/**
 *
 * Constructor to create a  DescriptionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DescriptionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectData DescriptionCreateInIn) {
    super(id, context, "DescriptionCreate");
    DescriptionCreateIn = DescriptionCreateInIn;
  }

  public void translateToMap() {
    if (DescriptionCreateIn != null) {
      DescriptionCreateIn.resetFlags(true, true);
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionCreateIn, new HashMap(), "Description").get("Description"));
    }
  }


/**
 *
 * Sets the Description
 * @param DescriptionCreateInIn Value of the DescriptionCreateIn
 *
 */

  public void setDescription(DescriptionObjectData DescriptionCreateInIn) {
    DescriptionCreateIn = DescriptionCreateInIn;
  }

  public void translateFromMap() {
    DescriptionCreateIn = DescriptionObjectHelper.fromMap(inputMap, "Description");
  }

/**
 *
 * Gets the Description
 * @return Value of the Description
 *
 */

  public DescriptionObjectData getDescription( ) {
    return DescriptionCreateIn;
  }

}
