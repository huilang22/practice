/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a DocumentTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DocumentTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeObjectData DocTypecreate_In;
/**
 *
 * Constructor to create a  DocumentTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DocumentTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectData DocTypecreate_InIn) {
    super(id, context, "DocumentTypeCreate");
    DocTypecreate_In = DocTypecreate_InIn;
  }

  public void translateToMap() {
    if (DocTypecreate_In != null) {
      DocTypecreate_In.resetFlags(true, true);
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypecreate_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }


/**
 *
 * Sets the DocumentType
 * @param DocTypecreate_InIn Value of the DocTypecreate_In
 *
 */

  public void setDocumentType(DocumentTypeObjectData DocTypecreate_InIn) {
    DocTypecreate_In = DocTypecreate_InIn;
  }

  public void translateFromMap() {
    DocTypecreate_In = DocumentTypeObjectHelper.fromMap(inputMap, "DocumentType");
  }

/**
 *
 * Gets the DocumentType
 * @return Value of the DocumentType
 *
 */

  public DocumentTypeObjectData getDocumentType( ) {
    return DocTypecreate_In;
  }

}
