/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeObjectData InvsTypeUpdateIn;
/**
 *
 * Constructor to create a  InvsTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData InvsTypeUpdateInIn) {
    super(id, context, "InvsTypeUpdate");
    InvsTypeUpdateIn = InvsTypeUpdateInIn;
  }

  public void translateToMap() {
    if (InvsTypeUpdateIn != null) {
      InvsTypeUpdateIn.resetFlags(true, true);
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeUpdateIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }


/**
 *
 * Sets the InvsType
 * @param InvsTypeUpdateInIn Value of the InvsTypeUpdateIn
 *
 */

  public void setInvsType(InvsTypeObjectData InvsTypeUpdateInIn) {
    InvsTypeUpdateIn = InvsTypeUpdateInIn;
  }

  public void translateFromMap() {
    InvsTypeUpdateIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsType");
  }

/**
 *
 * Gets the InvsType
 * @return Value of the InvsType
 *
 */

  public InvsTypeObjectData getInvsType( ) {
    return InvsTypeUpdateIn;
  }

}
