/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcContentTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcContentTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcContentTypeObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcContentTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcContentTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectData CreateInIn) {
    super(id, context, "CtcContentTypeCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }


/**
 *
 * Sets the CtcContentType
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcContentType(CtcContentTypeObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcContentTypeObjectHelper.fromMap(inputMap, "CtcContentType");
  }

/**
 *
 * Gets the CtcContentType
 * @return Value of the CtcContentType
 *
 */

  public CtcContentTypeObjectData getCtcContentType( ) {
    return CreateIn;
  }

}
