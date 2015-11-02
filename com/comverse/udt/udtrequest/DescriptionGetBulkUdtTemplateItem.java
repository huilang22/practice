/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionGetBulkUdtTemplateItem.java
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
 * Class used to create a DescriptionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DescriptionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DescriptionObjectKeyData DescriptionGetIn;
/**
 *
 * Constructor to create a  DescriptionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DescriptionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectKeyData DescriptionGetInIn) {
    super(id, context, "DescriptionGet");
    DescriptionGetIn = DescriptionGetInIn;
  }

  public void translateToMap() {
    if (DescriptionGetIn != null) {
      DescriptionGetIn.resetFlags(true, true);
      addInput("Description", DescriptionObjectKeyHelper.toMap(DescriptionGetIn, new HashMap(), "DescriptionObjectKeyData").get("DescriptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the Description
 * @param DescriptionGetInIn Value of the DescriptionGetIn
 *
 */

  public void setDescription(DescriptionObjectKeyData DescriptionGetInIn) {
    DescriptionGetIn = DescriptionGetInIn;
  }

  public void translateFromMap() {
    DescriptionGetIn = DescriptionObjectKeyHelper.fromMap(inputMap, "Description");
  }

/**
 *
 * Gets the Description
 * @return Value of the Description
 *
 */

  public DescriptionObjectKeyData getDescription( ) {
    return DescriptionGetIn;
  }

}
