/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeObjectData InvsContainerTypeCreateIn;
/**
 *
 * Constructor to create a  InvsContainerTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectData InvsContainerTypeCreateInIn) {
    super(id, context, "InvsContainerTypeCreate");
    InvsContainerTypeCreateIn = InvsContainerTypeCreateInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeCreateIn != null) {
      InvsContainerTypeCreateIn.resetFlags(true, true);
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeCreateIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }


/**
 *
 * Sets the InvsContainerType
 * @param InvsContainerTypeCreateInIn Value of the InvsContainerTypeCreateIn
 *
 */

  public void setInvsContainerType(InvsContainerTypeObjectData InvsContainerTypeCreateInIn) {
    InvsContainerTypeCreateIn = InvsContainerTypeCreateInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeCreateIn = InvsContainerTypeObjectHelper.fromMap(inputMap, "InvsContainerType");
  }

/**
 *
 * Gets the InvsContainerType
 * @return Value of the InvsContainerType
 *
 */

  public InvsContainerTypeObjectData getInvsContainerType( ) {
    return InvsContainerTypeCreateIn;
  }

}
