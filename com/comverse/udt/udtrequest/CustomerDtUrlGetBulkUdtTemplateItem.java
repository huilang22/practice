/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CustomerDtUrlGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDtUrlGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer DocumentId;
/**
 *
 * Constructor to create a  CustomerDtUrlGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDtUrlGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer DocumentIdIn) {
    super(id, context, "CustomerDtUrlGet");
    DocumentId = DocumentIdIn;
  }

  public void translateToMap() {
    if (DocumentId != null) {
      addInput("DocumentId", DocumentId);
    }
  }


/**
 *
 * Sets the DocumentId
 * @param DocumentIdIn Value of the DocumentId
 *
 */

  public void setDocumentId(Integer DocumentIdIn) {
    DocumentId = DocumentIdIn;
  }

  public void translateFromMap() {
    DocumentId = (Integer)inputMap.get("DocumentId");
  }

/**
 *
 * Gets the DocumentId
 * @return Value of the DocumentId
 *
 */

  public Integer getDocumentId( ) {
    return DocumentId;
  }

}
