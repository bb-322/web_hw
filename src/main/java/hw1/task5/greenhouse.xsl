<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">

        <html>
            <body>

                <h2>Flowers</h2>

                <table style="border-collapse: collapse; width: 100%;">

                    <tr>
                        <th style="border: 1px solid black; padding: 6px;">Id</th>
                        <th style="border: 1px solid black; padding: 6px;">Name</th>
                        <th style="border: 1px solid black; padding: 6px;">Soil</th>
                        <th style="border: 1px solid black; padding: 6px;">Origin</th>
                        <th style="border: 1px solid black; padding: 6px;">Multiplying</th>
                        <th style="border: 1px solid black; padding: 6px;">Stem Color</th>
                        <th style="border: 1px solid black; padding: 6px;">Leaf Color</th>
                        <th style="border: 1px solid black; padding: 6px;">Average Size</th>
                        <th style="border: 1px solid black; padding: 6px;">Temperature</th>
                        <th style="border: 1px solid black; padding: 6px;">Light</th>
                        <th style="border: 1px solid black; padding: 6px;">Watering</th>
                    </tr>

                    <xsl:for-each select="greenhouse/flowers/flower">
                        <xsl:sort select="growing_tips/temperature" data-type="number" order="ascending"/>

                        <tr>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="@id"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="name"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="soil"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="origin"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="multiplying"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="visual_params/stem_color"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="visual_params/leaf_color"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="visual_params/average_size"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="growing_tips/temperature"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="growing_tips/light"/></td>
                            <td style="border: 1px solid black; padding: 6px;"><xsl:value-of select="growing_tips/watering"/></td>
                        </tr>

                    </xsl:for-each>

                </table>

            </body>
        </html>

    </xsl:template>

</xsl:stylesheet>