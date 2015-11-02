/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcItemUrlCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUrlCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemUrlObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemUrlCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUrlCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectData CreateInIn) {
    super(id, context, "CtcItemUrlCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }


/**
 *
 * Sets the CtcItemUrl
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItemUrl(CtcItemUrlObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemUrlObjectHelper.fromMap(inputMap, "CtcItemUrl");
  }

/**
 *
 * Gets the CtcItemUrl
 * @return Value of the CtcItemUrl
 *
 */

  public CtcItemUrlObjectData getCtcItemUrl( ) {
    return CreateIn;
  }

}
