/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ExternalRcGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalRcGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalRcObjectKeyData ExternalRcGetIn;
/**
 *
 * Constructor to create a  ExternalRcGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalRcGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectKeyData ExternalRcGetInIn) {
    super(id, context, "ExternalRcGet");
    ExternalRcGetIn = ExternalRcGetInIn;
  }

  public void translateToMap() {
    if (ExternalRcGetIn != null) {
      ExternalRcGetIn.resetFlags(true, true);
      addInput("ExternalRc", ExternalRcObjectKeyHelper.toMap(ExternalRcGetIn, new HashMap(), "ExternalRcObjectKeyData").get("ExternalRcObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExternalRc
 * @param ExternalRcGetInIn Value of the ExternalRcGetIn
 *
 */

  public void setExternalRc(ExternalRcObjectKeyData ExternalRcGetInIn) {
    ExternalRcGetIn = ExternalRcGetInIn;
  }

  public void translateFromMap() {
    ExternalRcGetIn = ExternalRcObjectKeyHelper.fromMap(inputMap, "ExternalRc");
  }

/**
 *
 * Gets the ExternalRc
 * @return Value of the ExternalRc
 *
 */

  public ExternalRcObjectKeyData getExternalRc( ) {
    return ExternalRcGetIn;
  }

}
