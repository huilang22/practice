/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSecurityTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSecurityTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSecurityTypeObjectData InvsSecurityTypeUpdateIn;
/**
 *
 * Constructor to create a  InvsSecurityTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSecurityTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectData InvsSecurityTypeUpdateInIn) {
    super(id, context, "InvsSecurityTypeUpdate");
    InvsSecurityTypeUpdateIn = InvsSecurityTypeUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSecurityTypeUpdateIn != null) {
      InvsSecurityTypeUpdateIn.resetFlags(true, true);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeUpdateIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }


/**
 *
 * Sets the InvsSecurityType
 * @param InvsSecurityTypeUpdateInIn Value of the InvsSecurityTypeUpdateIn
 *
 */

  public void setInvsSecurityType(InvsSecurityTypeObjectData InvsSecurityTypeUpdateInIn) {
    InvsSecurityTypeUpdateIn = InvsSecurityTypeUpdateInIn;
  }

  public void translateFromMap() {
    InvsSecurityTypeUpdateIn = InvsSecurityTypeObjectHelper.fromMap(inputMap, "InvsSecurityType");
  }

/**
 *
 * Gets the InvsSecurityType
 * @return Value of the InvsSecurityType
 *
 */

  public InvsSecurityTypeObjectData getInvsSecurityType( ) {
    return InvsSecurityTypeUpdateIn;
  }

}
