/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeRefObjectData InvsContainerTypeRefUpdateIn;
/**
 *
 * Constructor to create a  InvsContainerTypeRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectData InvsContainerTypeRefUpdateInIn) {
    super(id, context, "InvsContainerTypeRefUpdate");
    InvsContainerTypeRefUpdateIn = InvsContainerTypeRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeRefUpdateIn != null) {
      InvsContainerTypeRefUpdateIn.resetFlags(true, true);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefUpdateIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }


/**
 *
 * Sets the InvsContainerTypeRef
 * @param InvsContainerTypeRefUpdateInIn Value of the InvsContainerTypeRefUpdateIn
 *
 */

  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectData InvsContainerTypeRefUpdateInIn) {
    InvsContainerTypeRefUpdateIn = InvsContainerTypeRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeRefUpdateIn = InvsContainerTypeRefObjectHelper.fromMap(inputMap, "InvsContainerTypeRef");
  }

/**
 *
 * Gets the InvsContainerTypeRef
 * @return Value of the InvsContainerTypeRef
 *
 */

  public InvsContainerTypeRefObjectData getInvsContainerTypeRef( ) {
    return InvsContainerTypeRefUpdateIn;
  }

}
