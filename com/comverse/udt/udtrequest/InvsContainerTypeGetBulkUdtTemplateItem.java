/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeObjectKeyData InvsContainerTypeGetIn;
/**
 *
 * Constructor to create a  InvsContainerTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectKeyData InvsContainerTypeGetInIn) {
    super(id, context, "InvsContainerTypeGet");
    InvsContainerTypeGetIn = InvsContainerTypeGetInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeGetIn != null) {
      InvsContainerTypeGetIn.resetFlags(true, true);
      addInput("InvsContainerType", InvsContainerTypeObjectKeyHelper.toMap(InvsContainerTypeGetIn, new HashMap(), "InvsContainerTypeObjectKeyData").get("InvsContainerTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsContainerType
 * @param InvsContainerTypeGetInIn Value of the InvsContainerTypeGetIn
 *
 */

  public void setInvsContainerType(InvsContainerTypeObjectKeyData InvsContainerTypeGetInIn) {
    InvsContainerTypeGetIn = InvsContainerTypeGetInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeGetIn = InvsContainerTypeObjectKeyHelper.fromMap(inputMap, "InvsContainerType");
  }

/**
 *
 * Gets the InvsContainerType
 * @return Value of the InvsContainerType
 *
 */

  public InvsContainerTypeObjectKeyData getInvsContainerType( ) {
    return InvsContainerTypeGetIn;
  }

}
