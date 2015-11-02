/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeRefObjectKeyData InvsContainerTypeRefGetIn;
/**
 *
 * Constructor to create a  InvsContainerTypeRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectKeyData InvsContainerTypeRefGetInIn) {
    super(id, context, "InvsContainerTypeRefGet");
    InvsContainerTypeRefGetIn = InvsContainerTypeRefGetInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeRefGetIn != null) {
      InvsContainerTypeRefGetIn.resetFlags(true, true);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectKeyHelper.toMap(InvsContainerTypeRefGetIn, new HashMap(), "InvsContainerTypeRefObjectKeyData").get("InvsContainerTypeRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsContainerTypeRef
 * @param InvsContainerTypeRefGetInIn Value of the InvsContainerTypeRefGetIn
 *
 */

  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectKeyData InvsContainerTypeRefGetInIn) {
    InvsContainerTypeRefGetIn = InvsContainerTypeRefGetInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeRefGetIn = InvsContainerTypeRefObjectKeyHelper.fromMap(inputMap, "InvsContainerTypeRef");
  }

/**
 *
 * Gets the InvsContainerTypeRef
 * @return Value of the InvsContainerTypeRef
 *
 */

  public InvsContainerTypeRefObjectKeyData getInvsContainerTypeRef( ) {
    return InvsContainerTypeRefGetIn;
  }

}
